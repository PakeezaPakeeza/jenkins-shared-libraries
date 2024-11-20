def call(){
  sh "docker compose down --remove-orphans && docker compose up -d --build"
}
