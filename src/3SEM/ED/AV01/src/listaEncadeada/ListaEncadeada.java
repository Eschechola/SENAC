package listaEncadeada;

public class ListaEncadeada {
    private ItemLista _inicio = null;
    private ItemLista _atual;
    private ItemLista _auxiliar;

    public void inserirItem(Object objeto){
        if(_inicio == null){
            _inicio = new ItemLista(objeto, null);
            _auxiliar = _inicio;
        }
        else{
            _atual = new ItemLista(objeto, null);
            _auxiliar.setProximoItem(_atual);
            _auxiliar = _atual;
        }
    }

    public void exibirItens(){
        var itemAtual = _inicio;

        while(itemAtual != null){
            System.out.println(itemAtual.getObjeto().toString());
            itemAtual = itemAtual.getProximoItem();
        }
    }

    public ItemLista pesquisarItemPorId(int id){
        var itemAtual = _inicio;

        while(itemAtual != null){
            var itemAtualValor = (Carro)itemAtual.getObjeto();

            if(itemAtualValor.getId() == id)
                return itemAtual;

            itemAtual = itemAtual.getProximoItem();
        }

        return null;
    }

    public boolean removerItem(int id) {
        var itemRemover = pesquisarItemPorId(id);

        if(itemRemover == null)
            return false;

        if(itemRemover == _inicio){
            _inicio = _inicio.getProximoItem();
            return true;
        }

        if(itemRemover == _atual){
            var itemAnterior = obterItemAnterior(id);
            _atual = itemAnterior;
            _auxiliar = _atual;
            itemAnterior.setProximoItem(null);

            return true;
        }

        var itemAnterior = obterItemAnterior(id);
        var proximoItemRemover = itemRemover.getProximoItem();
        itemAnterior.setProximoItem(proximoItemRemover);
        itemRemover.setProximoItem(null);

        return true;
    }

    private ItemLista obterItemAnterior(int id){
        var itemAtual = _inicio;

        while(itemAtual != null){
            var proximoItemValor = (Carro)itemAtual.getProximoItem().getObjeto();

            if(proximoItemValor.getId() == id)
                return itemAtual;

            itemAtual = itemAtual.getProximoItem();
        }

        return null;
    }
}
