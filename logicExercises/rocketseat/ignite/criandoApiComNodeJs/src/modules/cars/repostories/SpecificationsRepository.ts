import { Specification } from "../model/Specification";
import {
  ISpecificationsRepository,
  ICreateSpecificationDTO,
} from "./interfaces/ISpecificationsRepository";

class SpecificationsRepository implements ISpecificationsRepository {
  private specifications: Specification[];

  constructor() {
    this.specifications = [];
  }

  create({ name, description }: ICreateSpecificationDTO): void {
    const specification = new Specification();
    Object.assign(specification, { name, description });
    this.specifications.push(specification);
  }

  findByName(name: string): Specification {
    const specification = this.specifications.find(
      (spec) => spec.name === name
    );
    return specification;
  }
}

export { SpecificationsRepository };
