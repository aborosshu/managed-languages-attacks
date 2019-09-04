package objecthijacking;

class Secret {
    private char[] secret;
    private Boolean shared = false;

    Secret(String s) {
        this.secret = s.toCharArray();
    }

    final String read() {
        if (!shared) {
            shared = true;
            return String.valueOf(this.secret);
        } else throw new IllegalStateException("Already shared");
    }

    final void delete() {
        if (!shared) {
            for (int i = 0; i < secret.length; i++) {
                secret[i] = 'X';
            }
        }
    }

    final void printSecret() {
        System.out.println(this.secret);
    }
}