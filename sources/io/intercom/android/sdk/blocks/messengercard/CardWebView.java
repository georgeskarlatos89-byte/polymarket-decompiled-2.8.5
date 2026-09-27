package io.intercom.android.sdk.blocks.messengercard;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;
import defpackage.gn2;
import defpackage.jca;
import defpackage.qsn;
import defpackage.t85;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import kotlin.Unit;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public class CardWebView extends WebView {
    private t85 eventScope;

    public CardWebView(Context context) {
        super(context);
    }

    public static /* synthetic */ Unit a(CardWebView cardWebView, IntercomEvent intercomEvent) {
        return cardWebView.lambda$setUp$0(intercomEvent);
    }

    private /* synthetic */ Unit lambda$setUp$0(IntercomEvent intercomEvent) {
        if (intercomEvent == IntercomEvent.CardUpdated.INSTANCE) {
            reload();
        }
        return Unit.INSTANCE;
    }

    @Override // android.webkit.WebView
    public void destroy() {
        t85 t85Var = this.eventScope;
        if (t85Var != null) {
            jca jcaVar = (jca) t85Var.getCoroutineContext().get(jca.C0);
            if (jcaVar != null) {
                jcaVar.e(null);
            }
            this.eventScope = null;
        }
        super.destroy();
    }

    public void setUp() {
        getSettings().setAllowFileAccess(false);
        this.eventScope = qsn.b();
        Injector.get().getDataLayer().listenToEvents(this.eventScope, new gn2(this, 7));
    }

    public CardWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
