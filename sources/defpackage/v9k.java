package defpackage;

import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class v9k implements Sequence {
    final /* synthetic */ ViewGroup a;

    public v9k(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new w9k(this.a);
    }
}
