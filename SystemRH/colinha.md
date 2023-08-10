    // Por se tratar de uma aplicação dependente do banco, nada de get e set estragando o código

    // String cpfSemMascara = cpf.replaceAll("[^0-9]", "");

    // // Verificar se o CPF tem 11 dígitos
    // if (cpfSemMascara.length() != 11) {
    //     throw new IllegalArgumentException("CPF inválido: Insira um CPF em formato válido!!.");
    // }
    // // Formatar o CPF com a máscara
    // this.cpf = cpfSemMascara.substring(0, 3) + "." +
    //         cpfSemMascara.substring(3, 6) + "." +
    //         cpfSemMascara.substring(6, 9) + "-" +
    //         cpfSemMascara.substring(9);


    // public void registrarPessoa (String nomePessoa) throws ParseException{
    //     SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
    //     Date dataNascimento = dataFormatada.parse("22/04/2003");



    // Comandos para colher usuário
    // String user     = console.readLine("Insira seu Usuário: ");
    // char[] password = console.readPassword("Digite sua senha: ");


----------------------------------------------------------------------Bloco de códigos para se adicionar pessoas no banco de dados---------------------------------------------------
 // CPF tem apenas 11 caracteres
        try (Connection conexao = connectionDatabase.obterConexao()) {
        String sql = "INSERT INTO candidatos (nome, cpf, data_nasc, conta, comprovante_em, comprovante_facul, mba, cnh) " +
        "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement connectionStatement = conexao.prepareStatement(sql)) {
            // Substitui os placeholders na instrução SQL pelos valores fornecidos
            for (int index = 0; index < array.length; index++) {
                connectionStatement.setString(index, resumePeople.get(index));
            }
    
           
            // Executa a instrução SQL de inserção/*  */
            connectionStatement.executeUpdate();
            System.out.println("\n" + nome + " adicionado");
            }
            
            } catch (SQLException e) {
            System.err.println("Erro ao adicionar pessoa no banco de dados: " + e.getMessage());
            e.printStackTrace();
            }
        }


----------------------------------------------------------------------------------Bloco de código para deletar pessoas-------------------------------------------------------------------------
// Função para retirar Pessoa
    // firstPerson.deletarPessoa("candidatos", 3);
    public static void deletarPessoa (String nomeTabela, int numeroID){
    // CPF tem apenas 11 caracteres
    try (Connection conexao = connectionDatabase.obterConexao()) {
        String sql = "DELETE FROM " + nomeTabela + " WHERE id = " + numeroID;
            try (PreparedStatement connectionStatement = conexao.prepareStatement(sql)) {
                connectionStatement.executeUpdate();
                System.out.println("\nColaborador removido");
                }
    } catch (SQLException e) {
        System.err.println("Erro ao apagar colaborador do banco de dados\n erro: " + e.getMessage());
        e.printStackTrace();}
    }


--------------------------------------------------------------------Formatador de horas---------------------------------------------------------------
    // ----------------++ Variáveis ++ -------------------- \\
    // Formatador de horário
    SimpleDateFormat formatoDiaMes  = new SimpleDateFormat("dd/MM/yyyy", new Locale("pt", "BR"));
    SimpleDateFormat formatoHorario = new SimpleDateFormat("HH:mm", new Locale("pt", "BR"));
    String diaMesFormatado          = formatoDiaMes.format(dataAgora);
    String horarioFormatado         = formatoHorario.format(dataAgora);