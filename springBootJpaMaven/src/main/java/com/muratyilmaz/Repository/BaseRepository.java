package com.muratyilmaz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import com.muratyilmaz.EntityModel.BaseEntity;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity> extends JpaRepository<T, Long> {

	@Transactional(readOnly = true)
	@Query("select e from #{#entityName} e where e.softDelete = false")
	Iterable<T> findAllActive();

	@Transactional(readOnly = true)
	@Query("select e from #{#entityName} e where e.id = ?1 and e.softDelete = false")
	T findOneActive(Long id);

	@Modifying
	@Transactional
	@Query("update #{#entityName} e set e.softDelete=true where e.id=?1")
	void softDelete(Long id);
}
