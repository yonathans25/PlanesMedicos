
package ar.com.softtek.academia.backend.bo.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.com.academia.entities.Socio;
import ar.com.academia.entities.excepciones.BusinessException;
import ar.com.softtek.academia.backend.dao.impl.MockSocioDAO;

@ContextConfiguration(locations = "/spring/application-root-spring.xml")
@RunWith(value = SpringJUnit4ClassRunner.class)
public class SocioBOTest {

	@Autowired
	private SocioBOimpl socioBO;
	@Autowired
	private MockSocioDAO socioDAO;

	@Before
	public void setUp() {
		socioBO.setSocioDAO(socioDAO);
	}

	@Test
	public void actualizarSocioTest() throws BusinessException {
		socioDAO.resetLista();
		Socio result = socioBO.getById(1);
		assertNotNull(result);
		assertEquals(1, result.getNumeroSocio());
		assertEquals("socio1", result.getNombreApellido());

		result.setNombreApellido("nuevoNombre");
		socioBO.update(result);

		result = socioBO.getById(1);
		assertNotNull(result);
		assertEquals(1, result.getNumeroSocio());
		assertEquals("nuevoNombre", result.getNombreApellido());
	}

	@Test
	public void borrarSocioTest() throws BusinessException {
		socioDAO.resetLista();

		Socio socio = socioBO.getById(3);
		assertNotNull(socio);
		assertEquals(3, socio.getNumeroSocio());
		assertEquals("socio3", socio.getNombreApellido());

		boolean result = socioBO.delete(3);
		assertTrue(result);

		socio = socioBO.getById(3);
		assertNull(socio);
	}

	@Test
	public void crearSocioTest() throws BusinessException {
		socioDAO.resetLista();
		List<Socio> result = socioBO.getAll();
		assertEquals(10, result.size());

		Socio socio = new Socio();
		socioBO.save(socio);

		result = socioBO.getAll();
		assertEquals(11, result.size());
	}

	@Test
	public void getSocioByIdTest() throws BusinessException {
		socioDAO.resetLista();
		Socio result = socioBO.getById(1);
		assertNotNull(result);
		assertEquals(1, result.getNumeroSocio());
		assertEquals("socio1", result.getNombreApellido());
	}

	@Test
	public void getAllSociosTest() throws BusinessException {
		socioDAO.resetLista();
		List<Socio> result = socioBO.getAll();
		assertEquals(10, result.size());
	}

	public SocioBOimpl getSocioBO() {
		return socioBO;
	}

	public void setSocioBO(SocioBOimpl socioBO) {
		this.socioBO = socioBO;
	}
}