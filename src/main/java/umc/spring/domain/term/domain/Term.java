package umc.spring.domain.term.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.spring.domain.shared.BaseTimeEntity;
import umc.spring.domain.shared.TermType;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Term extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long termId;

	@NotNull
	@Column
	private String termContent;

	@NotNull
	@Column(length = 20)
	private String termCategory;

	@NotNull
	@Column(columnDefinition = "VARCHAR(10)")
	@Enumerated(EnumType.STRING)
	private TermType termType;

	@Builder
	private Term(String termContent, String termCategory, TermType termType) {
		this.termContent = termContent;
		this.termCategory = termCategory;
		this.termType = termType;
	}
}
