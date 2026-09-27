package defpackage;

import android.graphics.Bitmap;
import com.polymarket.clients.ClientChatBattleSide;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes4.dex */
public final class sm3 {
    public float c;
    public float d;
    public float e;
    public float g;
    public float h;
    public float i;
    public final vk0 a = new vk0();
    public final vk0 b = new vk0();
    public final eq1 f = vmn.a(-1, 6, null);
    public float j = 14.0f;
    public long k = System.nanoTime();
    public float l = 0.5f;
    public float m = -1.0f;
    public float n = 0.18f;
    public float o = 0.82f;

    public final void a(String str, ClientChatBattleSide clientChatBattleSide, int i, Bitmap bitmap) {
        str.getClass();
        clientChatBattleSide.getClass();
        int e = lnf.e(i, 1, 6);
        String rawValue = clientChatBattleSide.getRawValue();
        if (Intrinsics.areEqual(rawValue, "home")) {
            this.h += e;
        } else if (Intrinsics.areEqual(rawValue, "away")) {
            this.i += e;
        }
        if (this.d > 0.0f) {
            long nanoTime = System.nanoTime();
            float f = ((float) (nanoTime - this.k)) / 1.0E9f;
            this.k = nanoTime;
            float f2 = (f * 50.0f) + this.j;
            if (f2 > 14.0f) {
                f2 = 14.0f;
            }
            this.j = f2;
            int min = Math.min(e, (int) f2);
            if (min > 0) {
                this.j -= min;
            }
            if (min <= 0) {
                return;
            }
            String rawValue2 = clientChatBattleSide.getRawValue();
            int i2 = 0;
            if (!Intrinsics.areEqual(rawValue2, "home") && !Intrinsics.areEqual(rawValue2, "away")) {
                while (i2 < min) {
                    c(str, rawValue2, bitmap);
                    i2++;
                }
            } else {
                while (i2 < min) {
                    this.b.addLast(new rm3(str, rawValue2, bitmap));
                    i2++;
                }
            }
            this.f.f(Unit.INSTANCE);
        }
    }

    public final void b() {
        float f = this.h;
        this.l = lnf.d(((((2.0f + f) / ((f + this.i) + 4.0f)) - 0.5f) * 0.7f) + 0.5f, 0.2f, 0.8f);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(String str, String str2, Bitmap bitmap) {
        float f;
        float f2;
        float f3;
        float f4;
        s4 s4Var;
        float b;
        float f5;
        vk0 vk0Var;
        float f6 = this.l * this.d;
        float f7 = this.m;
        if (f7 < 0.0f) {
            f7 = 0.35f * this.e;
        }
        if (Intrinsics.areEqual(str2, "home")) {
            f3 = this.n;
            f4 = this.d;
        } else if (Intrinsics.areEqual(str2, "away")) {
            f3 = this.o;
            f4 = this.d;
        } else {
            f = this.d / 2.0f;
            f2 = this.e / 2.0f;
            if (Intrinsics.areEqual(str2, "home") && !Intrinsics.areEqual(str2, "away")) {
                gnf.a.getClass();
                s4Var = gnf.b;
                float b2 = s4Var.b() * 6.2831855f;
                float b3 = (s4Var.b() * 70.0f) + 80.0f;
                double d = b2;
                b = ((float) Math.cos(d)) * b3;
                f5 = (((float) Math.sin(d)) * b3) - 60.0f;
            } else {
                gnf.a.getClass();
                s4Var = gnf.b;
                b = ((f6 - f) / 0.6f) + ((s4Var.b() * 30.0f) - 15.0f);
                f5 = -((s4Var.b() * 70.0f) + 80.0f);
            }
            float f8 = b;
            float f9 = f5;
            vk0Var = this.a;
            if (vk0Var.c >= 240) {
                vk0Var.removeFirst();
            }
            vk0Var.addLast(new qm3(str, bitmap, f, f2, f8, f9, (s4Var.b() * 0.6f) - 0.3f, (s4Var.b() * 10.0f) - 5.0f));
        }
        f2 = f7;
        f = f3 * f4;
        if (Intrinsics.areEqual(str2, "home")) {
        }
        gnf.a.getClass();
        s4Var = gnf.b;
        b = ((f6 - f) / 0.6f) + ((s4Var.b() * 30.0f) - 15.0f);
        f5 = -((s4Var.b() * 70.0f) + 80.0f);
        float f82 = b;
        float f92 = f5;
        vk0Var = this.a;
        if (vk0Var.c >= 240) {
        }
        vk0Var.addLast(new qm3(str, bitmap, f, f2, f82, f92, (s4Var.b() * 0.6f) - 0.3f, (s4Var.b() * 10.0f) - 5.0f));
    }
}
