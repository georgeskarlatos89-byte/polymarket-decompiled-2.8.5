package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class i81 implements kt0 {
    public it0 b;
    public it0 c;
    public it0 d;
    public it0 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public i81() {
        ByteBuffer byteBuffer = kt0.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        it0 it0Var = it0.e;
        this.d = it0Var;
        this.e = it0Var;
        this.b = it0Var;
        this.c = it0Var;
    }

    @Override // defpackage.kt0
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = kt0.a;
        return byteBuffer;
    }

    @Override // defpackage.kt0
    public final it0 c(it0 it0Var) {
        this.d = it0Var;
        this.e = f(it0Var);
        if (isActive()) {
            return this.e;
        }
        return it0.e;
    }

    @Override // defpackage.kt0
    public final void d() {
        this.h = true;
        h();
    }

    @Override // defpackage.kt0
    public boolean e() {
        if (this.h && this.g == kt0.a) {
            return true;
        }
        return false;
    }

    public abstract it0 f(it0 it0Var);

    @Override // defpackage.kt0
    public final void flush() {
        this.g = kt0.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        g();
    }

    @Override // defpackage.kt0
    public boolean isActive() {
        if (this.e != it0.e) {
            return true;
        }
        return false;
    }

    public final ByteBuffer j(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.kt0
    public final void reset() {
        flush();
        this.f = kt0.a;
        it0 it0Var = it0.e;
        this.d = it0Var;
        this.e = it0Var;
        this.b = it0Var;
        this.c = it0Var;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
