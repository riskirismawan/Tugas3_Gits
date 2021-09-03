fun main() {
    for (i in 1..20) {
        if (i%2 == 0) continue
        else {
            for (j in 20 downTo i) {
                print(" ")
            }
            for (j in 1..i) {
                if (j == 1) print("/")
                else print("#")
            }
            for (j in 1..i) {
                if (j == i) print("\\")
                else print("#")
            }
        }
        println()
    }
    for (i in 1..14) {
        for (j in 1..40) {
            if (i == 11 || i == 1) {
                if (j<7 || j in 13..14 || j in 21..22 || j in 29..30) print(" ")
                else {
                    if (j == 37) break
                    print("#")
                }
            }
            else if (i == 12) {
                if (j<5) print(" ")
                else {
                    if (j == 38) break
                    print("#")
                }
            }
            else if (i == 13) {
                if (j<4) print(" ")
                else {
                    if (j == 40) break
                    print("#")
                }
            }
            else if (i >=14) {
                if (j<3) print(" ")
                else {
                    print("#")
                }
            }
            else {
                if (j<8 || j in 12..15 || j in 20..23 || j in 28..31) print(" ")
                else {
                    if (j == 36) break
                    print("#")
                }
            }
        }
        println()
    }

}