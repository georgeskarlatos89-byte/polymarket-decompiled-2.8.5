package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class z56 implements o5c {
    public final /* synthetic */ int a;
    public final o5c b;
    public final Enum c;
    public final Enum d;

    public /* synthetic */ z56(o5c o5cVar, Enum r2, Enum r3, int i) {
        this.a = i;
        this.b = o5cVar;
        this.c = r2;
        this.d = r3;
    }

    @Override // defpackage.o5c
    public final int B(int i) {
        switch (this.a) {
            case 0:
                return this.b.B(i);
            case 1:
                return this.b.B(i);
            default:
                return this.b.B(i);
        }
    }

    @Override // defpackage.o5c
    public final int L(int i) {
        switch (this.a) {
            case 0:
                return this.b.L(i);
            case 1:
                return this.b.L(i);
            default:
                return this.b.L(i);
        }
    }

    @Override // defpackage.o5c
    public final int N(int i) {
        switch (this.a) {
            case 0:
                return this.b.N(i);
            case 1:
                return this.b.N(i);
            default:
                return this.b.N(i);
        }
    }

    @Override // defpackage.o5c
    public final cne T(long j) {
        int B;
        int L;
        int B2;
        int L2;
        int B3;
        int L3;
        switch (this.a) {
            case 0:
                d7a d7aVar = (d7a) this.d;
                d7a d7aVar2 = d7a.Width;
                z6a z6aVar = (z6a) this.c;
                int i = 32767;
                o5c o5cVar = this.b;
                if (d7aVar == d7aVar2) {
                    if (z6aVar == z6a.Max) {
                        L = o5cVar.N(rz4.h(j));
                    } else {
                        L = o5cVar.L(rz4.h(j));
                    }
                    if (rz4.d(j)) {
                        i = rz4.h(j);
                    }
                    return new l68(L, i, 0);
                }
                if (z6aVar == z6a.Max) {
                    B = o5cVar.b(rz4.i(j));
                } else {
                    B = o5cVar.B(rz4.i(j));
                }
                if (rz4.e(j)) {
                    i = rz4.i(j);
                }
                return new l68(i, B, 0);
            case 1:
                g6c g6cVar = (g6c) this.d;
                g6c g6cVar2 = g6c.Width;
                f6c f6cVar = (f6c) this.c;
                int i2 = 32767;
                o5c o5cVar2 = this.b;
                if (g6cVar == g6cVar2) {
                    if (f6cVar == f6c.Max) {
                        L2 = o5cVar2.N(rz4.h(j));
                    } else {
                        L2 = o5cVar2.L(rz4.h(j));
                    }
                    if (rz4.d(j)) {
                        i2 = rz4.h(j);
                    }
                    return new l68(L2, i2, 1);
                }
                if (f6cVar == f6c.Max) {
                    B2 = o5cVar2.b(rz4.i(j));
                } else {
                    B2 = o5cVar2.B(rz4.i(j));
                }
                if (rz4.e(j)) {
                    i2 = rz4.i(j);
                }
                return new l68(i2, B2, 1);
            default:
                b9d b9dVar = (b9d) this.d;
                b9d b9dVar2 = b9d.Width;
                a9d a9dVar = (a9d) this.c;
                int i3 = 32767;
                o5c o5cVar3 = this.b;
                if (b9dVar == b9dVar2) {
                    if (a9dVar == a9d.Max) {
                        L3 = o5cVar3.N(rz4.h(j));
                    } else {
                        L3 = o5cVar3.L(rz4.h(j));
                    }
                    if (rz4.d(j)) {
                        i3 = rz4.h(j);
                    }
                    return new l68(L3, i3, 2);
                }
                if (a9dVar == a9d.Max) {
                    B3 = o5cVar3.b(rz4.i(j));
                } else {
                    B3 = o5cVar3.B(rz4.i(j));
                }
                if (rz4.e(j)) {
                    i3 = rz4.i(j);
                }
                return new l68(i3, B3, 2);
        }
    }

    @Override // defpackage.o5c
    public final int b(int i) {
        switch (this.a) {
            case 0:
                return this.b.b(i);
            case 1:
                return this.b.b(i);
            default:
                return this.b.b(i);
        }
    }

    @Override // defpackage.o5c
    public final Object o() {
        switch (this.a) {
            case 0:
                return this.b.o();
            case 1:
                return this.b.o();
            default:
                return this.b.o();
        }
    }
}
