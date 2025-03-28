package model.entities;

public abstract class BaseEntity
{

	protected Long id;

	public BaseEntity()	{	}
	public BaseEntity(Long id)
	{
		this.id = id;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}
}
