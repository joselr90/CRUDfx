import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Insertar {

    public void insertar(){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.crud.jpa");
        PartidoH nuevojugador = new PartidoH("Pepote","Cipote","Chapote","Bullas",99);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(nuevojugador);

        entityManager.getTransaction().commit();

        entityManager.close();

    }
}
