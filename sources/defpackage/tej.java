package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tej extends i81 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.i81, defpackage.kt0
    public final ByteBuffer a() {
        int i;
        if (super.e() && (i = this.n) > 0) {
            j(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.a();
    }

    @Override // defpackage.kt0
    public final void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.l);
            this.o += min / this.b.d;
            this.l -= min;
            byteBuffer.position(position + min);
            if (this.l > 0) {
                return;
            }
            int i2 = i - min;
            int length = (this.n + i2) - this.m.length;
            ByteBuffer j = j(length);
            int i3 = u1k.i(length, 0, this.n);
            j.put(this.m, 0, i3);
            int i4 = u1k.i(length - i3, 0, i2);
            byteBuffer.limit(byteBuffer.position() + i4);
            j.put(byteBuffer);
            byteBuffer.limit(limit);
            int i5 = i2 - i4;
            int i6 = this.n - i3;
            this.n = i6;
            byte[] bArr = this.m;
            System.arraycopy(bArr, i3, bArr, 0, i6);
            byteBuffer.get(this.m, this.n, i5);
            this.n += i5;
            j.flip();
        }
    }

    @Override // defpackage.i81, defpackage.kt0
    public final boolean e() {
        if (super.e() && this.n == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.i81
    public final it0 f(it0 it0Var) {
        int i = it0Var.c;
        if (i != 2 && i != 4) {
            throw new jt0(it0Var);
        }
        this.k = true;
        if (this.i == 0 && this.j == 0) {
            return it0.e;
        }
        return it0Var;
    }

    @Override // defpackage.i81
    public final void g() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.i81
    public final void h() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.i81
    public final void i() {
        this.m = u1k.c;
    }
}
