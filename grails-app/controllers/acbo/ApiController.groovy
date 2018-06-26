package acbo

class ApiController {
    def loans () {
        def mem = new String[30000]
        sleep(Math.abs(new Random().nextInt() % 6000) + 1000)
        def bal = params.id.toLong() + 3893983
        respond ['outstandingBalance': bal]
    }

    def casas () {
        def bal = params.id.toLong() + 7182932
        respond ['availableBalance': bal]
    }
}