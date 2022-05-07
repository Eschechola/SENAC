package listaEncadeada;

public class ItemLista {
    private Object _objeto;
    private ItemLista _proximoItem;

    public ItemLista(
            Object objeto,
            ItemLista proximoItem) {
        this._objeto = objeto;
        this._proximoItem = proximoItem;
    }

    public Object getObjeto() {
        return _objeto;
    }

    public void setObjeto(Object objeto) {
        this._objeto = objeto;
    }

    public ItemLista getProximoItem() {
        return _proximoItem;
    }

    public void setProximoItem(ItemLista proximoItem) {
        this._proximoItem = proximoItem;
    }

    @Override
    public String toString() {
        return "ItemLista{" +
                "_objeto=" + _objeto +
                ", _proximoItem=" + _proximoItem +
                '}';
    }
}
