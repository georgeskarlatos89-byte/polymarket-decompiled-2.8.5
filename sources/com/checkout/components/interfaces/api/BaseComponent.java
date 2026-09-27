package com.checkout.components.interfaces.api;

import android.view.View;
import com.checkout.components.interfaces.model.ComponentName;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.pq4;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/interfaces/api/BaseComponent;", "", "", "Render", "(Lpq4;I)V", "Landroid/view/View;", "container", "provideView", "(Landroid/view/View;)Landroid/view/View;", "Lcom/checkout/components/interfaces/model/ComponentName;", "getName", "()Lcom/checkout/components/interfaces/model/ComponentName;", Keys.KEY_NAME, "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BaseComponent {
    void Render(pq4 pq4Var, int i);

    ComponentName getName();

    View provideView(View container);
}
