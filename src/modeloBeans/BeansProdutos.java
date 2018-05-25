package modeloBeans;

public class BeansProdutos {
    
    private int codigo;
    private String descricao;
    private String fabricante;
    private String categoria;
    private double preco;
    private int estoque;
    private String pesquisa;

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }
    

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) throws Exception {
        if(codigo > 100 || codigo < 1)
            throw new Exception("Código invalido!");
        else if(codigo > 1 && codigo <100 )
            this.codigo = codigo;
        this.codigo = codigo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) throws Exception {
        if(descricao.isEmpty() || descricao.length() < 5 || descricao.length() > 300)
            throw new Exception("Descrição inválida!");
        else if(descricao.length() > 5 && descricao.length() < 300)
            this.descricao = descricao;
        this.descricao = descricao;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) throws Exception {
        if(fabricante.isEmpty() || fabricante.length() < 2 || fabricante.length() > 50)
            throw new Exception("Fabricante Inválido!");
        else if(fabricante.length() > 2 && fabricante.length() < 50)
            this.fabricante = fabricante;
        
        this.fabricante = fabricante;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) throws Exception {
        if(categoria.isEmpty() || categoria.length() < 3 || categoria.length() > 50)
            throw new Exception("Categoria Inválida!");
        else if(categoria.length() > 3 && categoria.length() < 50)
            this.categoria = categoria;
        this.categoria = categoria;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws Exception{
        if(preco < 0 || preco > 100000.00)
            throw new Exception("Preço Inválido!");
        else if(preco > 0 && preco < 100000.00)
            this.preco = preco;
        this.preco = preco;
    }
    
    /**
     * @return the estoque
     */
    public int getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(int estoque) throws Exception{
        if(estoque < 0 || estoque > 200)
            throw new Exception("Estoque Inválido!");
        else if(estoque > 0 && estoque < 200)
            this.estoque = estoque;
        this.estoque = estoque;
    }


    
}
