package defpackage;

import android.os.Bundle;
import android.widget.RemoteViews;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class fbd {
    CharSequence mBigContentTitle;
    protected tad mBuilder;
    CharSequence mSummaryText;
    boolean mSummaryTextSet = false;

    public void addCompatExtras(Bundle bundle) {
        if (this.mSummaryTextSet) {
            bundle.putCharSequence("android.summaryText", this.mSummaryText);
        }
        CharSequence charSequence = this.mBigContentTitle;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String className = getClassName();
        if (className != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", className);
        }
    }

    public String getClassName() {
        return null;
    }

    public RemoteViews makeBigContentView(had hadVar) {
        return null;
    }

    public RemoteViews makeContentView(had hadVar) {
        return null;
    }

    public RemoteViews makeHeadsUpContentView(had hadVar) {
        return null;
    }

    public void setBuilder(tad tadVar) {
        if (this.mBuilder != tadVar) {
            this.mBuilder = tadVar;
            if (tadVar != null) {
                tadVar.d(this);
            }
        }
    }

    public void apply(had hadVar) {
    }
}
