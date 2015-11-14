class ErrorsController{
   def index(){ render "In errors controller"}

   def somethingWrong(){
      println("---> ErrorsController:somethingWrong: Not Found")
      render(view:'notFound')
   }

   def oops(){
      println("---> ErrorsController:oops: Something bad...")
      render(view:'oops')
   }
}
