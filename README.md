# API Specs Pendaftaran Lomba

## Users
### Create User

Request :
- Method : POST
- Enpoint : `/api/users`
- Header : 
  - Content-Type: application/json
  - Accept application/json
- Body :

```json
{
  "name" : "string",
  "email" : "string, unique",
  "password" : "string"
}
```

Response : 
```json

```

### Read User
### Update User
### Delete User