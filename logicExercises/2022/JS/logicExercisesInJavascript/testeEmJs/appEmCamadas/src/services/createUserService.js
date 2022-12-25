import { UserRepository } from "../repositories/userRepository";

class CreateUserService {

    //Recebe as informações do user ou os dados
    execute(data) {

        if (!data.username) {
            throw new Error("User name é obrigatorio")
        }
        //Chamar o repository 
        const userRepository = new UserRepositoryy();

        //verificar se user name existe no bd
        const existUser = userRepository.findByUsername(data.username);

        if (existUser) {
            throw new Error("Usuario já cadastrado")
        }

        return userRepository.save(data)

    }
}

export { CreateUserService }