package volta.cars.project.repository;

import org.springframework.data.repository.CrudRepository;

import volta.cars.project.model.NewsletterModel;

public interface NewsletterRepository extends CrudRepository<NewsletterModel, Long> {
}
