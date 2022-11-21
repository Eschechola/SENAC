package br.com.senac.pessoaapi.domain.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.*;

public abstract class Base
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int _id;

    protected Base()
    {
    }

    protected Base(int id)
    {
        _id = id;
    }

    public void setId(int id)
    {
        _id = id;
    }

    public int getId()
    {
        return _id;
    }
}
