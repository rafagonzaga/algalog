package com.algaworks.algalog.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.algaworks.algalog.domain.ValidationGroups;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter // Lombok
@Setter // Lombok
@Entity
public class Cliente {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// @Column(name = "nome")
	@NotBlank
	@Size(max = 60)
	private String nome;

	@NotBlank
	@Email
	@Size(max = 255)
	private String email;

	// Necessário para igualar com o nome dado pelo V002 do migration
	@NotBlank
	@Size(min = 12, max = 20)
	@Column(name = "fone")
	private String telefone;

}
