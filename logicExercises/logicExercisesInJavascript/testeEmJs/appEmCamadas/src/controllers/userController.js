import { CreateUserService } from '../services/createUserService.js';

class UserController {

    handle(req, res) {

        const { body } = req;

        //Chamar a camada de service

        try {
            const createUserService = new CreateUserService();
            const result = createUserService.execute(body)
            return res.json(result);

        } catch (err) {
            return res.json({ err: err.message });
        }
    }

}

export { UserController };