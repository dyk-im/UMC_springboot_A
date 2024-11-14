package umc.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import umc.spring.domain.store.domain.Store;

public interface StoreRepository extends JpaRepository<Store, Long>, StoreRepositoryCustom {
}
