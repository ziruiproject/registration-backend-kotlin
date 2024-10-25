
---

## Users

### Create User

Request:
- **Method**: `POST`
- **Endpoint**: `/api/users`
- **Headers**:
  - Content-Type: application/json
  - Accept: application/json
- **Body**:

```json
{
  "email" : "string, unique",
  "fullname" : "string",
  "password" : "string"
}
```

- **Response**:

```json
{
  "status": "success",
  "error": [],
  "message": "User berhasil dibuat!",
  "data": {
    "id" : "int",
    "email" : "string",
    "fullname" : "string"
  }
}
```

---

### Get All Users

Request:
- **Method**: `GET`
- **Endpoint**: `/api/users`
- **Headers**:
  - Content-Type: application/json
  - Accept: application/json

- **Response**:

```json
{
  "status": "success",
  "error": [],
  "message": "Semua user berhasil diambil!",
  "data": [
    {
      "id": "int",
      "email": "string",
      "fullname": "string"
    },
    {
      "id": "int",
      "email": "string",
      "fullname": "string"
    }
  ]
}
```

---

### Get User By ID

Request:
- **Method**: `GET`
- **Endpoint**: `/api/users/{id}`
- **Headers**:
  - Content-Type: application/json
  - Accept: application/json

- **Response**:

```json
{
  "status": "success",
  "error": [],
  "message": "User dengan id {id} berhasil diambil!",
  "data": {
    "id" : "int",
    "email" : "string",
    "fullname" : "string"
  }
}
```

---

### Update User

Request:
- **Method**: `PUT`
- **Endpoint**: `/api/users/{id}`
- **Headers**:
  - Content-Type: application/json
  - Accept: application/json
- **Body**:

```json
{
  "email" : "string, unique (optional)",
  "fullname" : "string (optional)",
  "password" : "string (optional)"
}
```

- **Response**:

```json
{
  "status": "success",
  "error": [],
  "message": "User berhasil diperbaharui!",
  "data": {
    "id" : "int",
    "email" : "string",
    "fullname" : "string"
  }
}
```

---

### Delete User

Request:
- **Method**: `DELETE`
- **Endpoint**: `/api/users/{id}`
- **Headers**:
  - Content-Type: application/json
  - Accept: application/json

- **Response**:

```json
{
  "status": "success",
  "error": [],
  "message": "User berhasil dihapus!",
  "data": []
}
```

---

### Error Response Format

### Not Found

```json
{
  "status": "error",
  "error": "404",
  "message": "Data  tidak ditemukan!",
  "data": []
}
```

