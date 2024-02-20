# springboot redis
# developed this project as POC for using springboot and redis together

## Pre requisite for running this application
### you should have a redis server up and running
### you need to change server and port of the redis server

## As of now this application has 2 end points 
  ### 1. Post (/customer): this endpoint will add student to the database {please don't mind endpoint name it actuaals adds Student only}
      ` Body:{
            "id": "1",
           "name": "xyz",
           "grade":  10,
           "gender:  "MALE"
     }`
  ### 2. Get (/customer): gets list of all students

## Redis commands that we can run in redis cli
  1. keys *: prints all key
  2. get `key`: get the value for `key`
  3. type `key`: prints the type of `key`
  4. smembers `key`: used when `key` type is set, prints the keys in set
  5. HGETALL `key`: used when `key` type is hash, prints the entire values stored in hash
  6. HGET `key` `field`: prints the value of particular fieldin that key, eg. if `field` value is name it will print name
  7. HMGET `key` `field1` `field2`: print the value of multiple fields
