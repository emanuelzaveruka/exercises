class UserRepository {

    users = []

    findByUsername(username) {

        //Select * From users where username = '' LIMIT 1
        const userExist = this.users.find((user) => user.username === username)
        return userExist;
    }

    save(user) {

        //Insert into user(username, name) values('','')
        const id = Math.random().toString();

        const userWithId = {
            ...user,
            id
        }

        this.users.push(userWithId);

        return user;
    }
}

export { UserRepository }