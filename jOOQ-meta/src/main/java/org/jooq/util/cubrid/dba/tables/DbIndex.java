/**
 * This class is generated by jOOQ
 */
package org.jooq.util.cubrid.dba.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class DbIndex extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1957888652;

	/**
	 * The singleton instance of <code>db_index</code>
	 */
	public static final org.jooq.util.cubrid.dba.tables.DbIndex DB_INDEX = new org.jooq.util.cubrid.dba.tables.DbIndex();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>db_index.index_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> INDEX_NAME = createField("index_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>db_index.is_unique</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_UNIQUE = createField("is_unique", org.jooq.impl.SQLDataType.VARCHAR.length(3), this);

	/**
	 * The column <code>db_index.is_reverse</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_REVERSE = createField("is_reverse", org.jooq.impl.SQLDataType.VARCHAR.length(3), this);

	/**
	 * The column <code>db_index.class_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CLASS_NAME = createField("class_name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>db_index.key_count</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> KEY_COUNT = createField("key_count", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>db_index.is_primary_key</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_PRIMARY_KEY = createField("is_primary_key", org.jooq.impl.SQLDataType.VARCHAR.length(3), this);

	/**
	 * The column <code>db_index.is_foreign_key</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_FOREIGN_KEY = createField("is_foreign_key", org.jooq.impl.SQLDataType.VARCHAR.length(3), this);

	/**
	 * The column <code>db_index.filter_expression</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> FILTER_EXPRESSION = createField("filter_expression", org.jooq.impl.SQLDataType.VARCHAR.length(255), this);

	/**
	 * The column <code>db_index.have_function</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> HAVE_FUNCTION = createField("have_function", org.jooq.impl.SQLDataType.VARCHAR.length(3), this);

	/**
	 * Create a <code>db_index</code> table reference
	 */
	public DbIndex() {
		super("db_index", org.jooq.util.cubrid.dba.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>db_index</code> table reference
	 */
	public DbIndex(java.lang.String alias) {
		super(alias, org.jooq.util.cubrid.dba.DefaultSchema.DEFAULT_SCHEMA, org.jooq.util.cubrid.dba.tables.DbIndex.DB_INDEX);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.cubrid.dba.tables.DbIndex as(java.lang.String alias) {
		return new org.jooq.util.cubrid.dba.tables.DbIndex(alias);
	}
}
