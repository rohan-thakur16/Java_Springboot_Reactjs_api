import axios from "axios";

const REST_BASE_URL='http://localhost:8080/api/employees';

export const listEmployees= axios.get(REST_BASE_URL);
