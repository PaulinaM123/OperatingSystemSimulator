package memory;

class FSB {

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private int begin;
    private int size;

    ////////////////////////////////////////////////////////////////////////////////////////////////

    int getBegin() {
        return begin;
    }

    void setBegin(int begin) {
        this.begin = begin;
    }

    int getSize() {
        return size;
    }

    void setSize(int size) {
        this.size = size;
    }

    FSB() {
        this.begin = 0;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
}
