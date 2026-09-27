package defpackage;

import android.content.Context;
import androidx.fragment.app.a0;
import com.bumptech.glide.a;
import java.util.HashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class gw8 {
    public final HashMap a = new HashMap();

    public gw8(ve5 ve5Var) {
    }

    public j2g a(Context context, a aVar, p6b p6bVar, a0 a0Var, boolean z) {
        o1k.b();
        o1k.b();
        HashMap hashMap = this.a;
        j2g j2gVar = (j2g) hashMap.get(p6bVar);
        if (j2gVar == null) {
            j7b j7bVar = new j7b(p6bVar);
            j2g j2gVar2 = new j2g(aVar, j7bVar, new t55(this, a0Var), context);
            hashMap.put(p6bVar, j2gVar2);
            j7bVar.d(new q7b(this, p6bVar));
            if (z) {
                j2gVar2.onStart();
            }
            return j2gVar2;
        }
        return j2gVar;
    }

    public gw8() {
    }
}
