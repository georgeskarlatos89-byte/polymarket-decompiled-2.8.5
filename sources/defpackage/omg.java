package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class omg implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchView a;

    public omg(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.a.p();
        return true;
    }
}
