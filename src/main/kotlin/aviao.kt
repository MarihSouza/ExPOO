fun main(){

    var aviao = aviao()


    aviao.modelo = "B777"
    aviao.tamanho = "73 metros"
    aviao.cor = "branco e vermelho"
    aviao.companhia = "TAM"
    aviao.limiteDePassageiros = 368


    println("modelo: ${aviao.modelo}")
    println("tamanho: ${aviao.tamanho}")
    println("cor: ${aviao.cor}")
    println("companhia: ${aviao.companhia}")
    println("limite de passageiros: ${aviao.limiteDePassageiros}")

    print(aviao)





}