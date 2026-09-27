package skip.lib;

import defpackage.py2;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lskip/lib/KotlinConverting;", "T", "", "kotlin", "nocopy", "", "(Z)Ljava/lang/Object;", "SkipLib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface KotlinConverting<T> {

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object kotlin$default(KotlinConverting kotlinConverting, boolean z, int i, Object obj) {
            return KotlinConverting.kotlin$default(kotlinConverting, z, i, obj);
        }
    }

    static /* synthetic */ Object kotlin$default(KotlinConverting kotlinConverting, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            return kotlinConverting.kotlin(z);
        }
        py2.f("Super calls with default arguments not supported in this target, function: kotlin");
        return null;
    }

    T kotlin(boolean nocopy);
}
