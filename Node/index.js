const express = require('express')
const app = express()
const port = 3000

const clientDir = __dirname + '\\client\\'

app.use(express.json())
app.use(express.urlencoded())

app.get('/', (req, res) => {
  res.sendFile(clientDir + 'index.html')
})

app.get('/hej', (req, res) => {
  res.sendFile(clientDir + 'style.css')
})

app.get('/image', (req, res) => {
  res.sendFile(clientDir + 'lord_kaldor_draigo.jpg')
})

app.post('/login', function (req, res) {

  console.log(req.body.name)

  res.send('SUCCESS!')
})

app.listen(port, () => console.log(`Example app listening on port port!`))