package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class th4 extends Lambda implements Function1 {
    public final /* synthetic */ Ref.b h;
    public final /* synthetic */ Ref.b i;
    public final /* synthetic */ String j;
    public final /* synthetic */ Ref.b k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public th4(Ref.b bVar, Ref.b bVar2, String str, Ref.b bVar3) {
        super(1);
        this.h = bVar;
        this.i = bVar2;
        this.j = str;
        this.k = bVar3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        String str;
        int i;
        int intValue = ((Number) obj).intValue();
        Ref.b bVar = this.h;
        int i2 = bVar.a;
        Ref.b bVar2 = this.i;
        int i3 = bVar2.a;
        while (true) {
            int i4 = bVar.a;
            z = true;
            str = this.j;
            if (i4 >= intValue || bVar2.a >= str.length()) {
                break;
            }
            char charAt = str.charAt(bVar2.a);
            Ref.b bVar3 = this.k;
            if (charAt == ' ') {
                i = 1;
            } else {
                if (charAt != '\t') {
                    break;
                }
                i = 4 - (bVar3.a % 4);
            }
            bVar.a += i;
            bVar3.a += i;
            bVar2.a++;
        }
        if (bVar2.a == str.length()) {
            bVar.a = bd0.API_PRIORITY_OTHER;
        }
        int i5 = bVar.a;
        if (intValue <= i5) {
            bVar.a = i5 - intValue;
        } else {
            bVar2.a = i3;
            bVar.a = i2;
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
