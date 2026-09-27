package skip.lib;

import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"kotlin", "", "nocopy", "", "SkipLib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class KotlinSupportKt {
    public static final Object kotlin(Object obj, boolean z) {
        KotlinConverting kotlinConverting;
        obj.getClass();
        if (obj instanceof KotlinConverting) {
            kotlinConverting = (KotlinConverting) obj;
        } else {
            kotlinConverting = null;
        }
        if (kotlinConverting != null) {
            Object kotlin2 = kotlinConverting.kotlin(z);
            kotlin2.getClass();
            return kotlin2;
        }
        if (!z && (obj instanceof MutableStruct)) {
            return StructKt.sref$default(obj, null, 1, null);
        }
        return obj;
    }

    public static /* synthetic */ Object kotlin$default(Object obj, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = false;
        }
        return kotlin(obj, z);
    }
}
