
# Teste para desenvolvimento SG Sistemas

Requisitos do teste

Backend (Spring Boot)

1. Configuração do Projeto:
 * Criar um projeto Sprint Boot utilizando initializzr com as dependências necessárias (Spring Web, Spring Data JPA, Mysql, Lombok).

 2. Modelagem de Entidades:
 * Implementar as entidades `Product` e `Supplier` com os seguintes atributos:

   °`Product`: `id`, `name`, `price`, `supplier` (Relação ManyToOne).

   °`Supplier`: `id`, `name`.

3. Repositórios:
* Criar  interfaces `ProductRepository` e `SupplierRepository` estendendo `JpaRepository`.

4. Controladores:
* Implementar um controlador  `productController` com os seguintes endpoints:

   ° `GET /products`: listar todos os products.

   ° `POST /products`: criar um novo product.

   ° `PUT /products`: atualizar um product existente.

   ° `DELETE /products`: deletar um product.

5. Configuração do Banco de Dados:
   * host: 192.168.1.250
   * port: 3308
   * username: root
   * password: senha1
