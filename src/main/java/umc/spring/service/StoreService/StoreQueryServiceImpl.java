package umc.spring.service.StoreService;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import umc.spring.Repository.StoreRepository;
import umc.spring.domain.store.domain.Store;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StoreQueryServiceImpl implements StoreQueryService {

	private final StoreRepository storeRepository;

	@Override
	public Optional<Store> findStore(Long id) {
		return storeRepository.findById(id);
	}

	@Override
	public List<Store> findStoresByNameAndScore(String storeName, Float avgRating) {
		List<Store> filteredStores = storeRepository.dynamicQueryWithBooleanBuilder(storeName, avgRating);

		filteredStores.forEach(store -> System.out.println("Store: " + store));

		return filteredStores;
	}
}
