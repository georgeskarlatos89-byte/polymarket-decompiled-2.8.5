package defpackage;

import android.graphics.BlendMode;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ap1 extends r0h {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ap1(Object obj, int i) {
        this.c = i;
        this.d = obj;
    }

    @Override // defpackage.r0h
    public final Shader b(long j) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                return (Shader) obj;
            default:
                int i2 = (int) (j & 4294967295L);
                float intBitsToFloat = Float.intBitsToFloat(i2) / 2.0f;
                int i3 = (int) (j >> 32);
                float intBitsToFloat2 = Float.intBitsToFloat(i3);
                float intBitsToFloat3 = Float.intBitsToFloat(i2) / 2.0f;
                LinearGradient a = p50.a((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L), (List) obj, null, 0);
                long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat(i3) / 2.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L);
                float intBitsToFloat4 = Float.intBitsToFloat(i3) / 2.0f;
                float intBitsToFloat5 = Float.intBitsToFloat(i2);
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat4) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat5));
                long j2 = ib4.f;
                return new ComposeShader(a, p50.a(floatToRawIntBits, floatToRawIntBits2, CollectionsKt.listOf(new ib4(j2), new ib4(ib4.b(j2, 0.4f, 0.0f, 0.0f, 0.0f, 14))), null, 0), BlendMode.MODULATE);
        }
    }
}
