package com.system.goldvision.model.metamodel;

import com.system.goldvision.model.Permissao;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Permissao.class)
public abstract class Permissao_ {

	public static volatile SingularAttribute<Permissao, Long> codigo;
	public static volatile SingularAttribute<Permissao, String> nome;

	public static final String CODIGO = "codigo";
	public static final String NOME = "nome";

}

