package defpackage;

import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import io.sentry.android.core.m0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class h60 implements jqi {
    public final i60 a;
    public final f60 b;
    public final f60 c;
    public final View d;

    public h60(i60 i60Var, f60 f60Var, f60 f60Var2, View view) {
        this.a = i60Var;
        this.b = f60Var;
        this.c = f60Var2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        int i2;
        int i3;
        int i4;
        gri griVar = (gri) this.b.invoke();
        final int i5 = 0;
        if (Intrinsics.areEqual(griVar, null)) {
            return false;
        }
        menu.clear();
        List list = griVar.a;
        int size = list.size();
        final int i6 = 1;
        int i7 = 0;
        int i8 = 1;
        int i9 = 1;
        while (i7 < size) {
            fri friVar = (fri) list.get(i7);
            int i10 = 2;
            if (friVar instanceof ori) {
                i = i8 + 1;
                Object obj = friVar.a;
                if (Intrinsics.areEqual(obj, e2n.a)) {
                    i4 = R.id.cut;
                } else if (Intrinsics.areEqual(obj, e2n.b)) {
                    i4 = R.id.copy;
                } else if (Intrinsics.areEqual(obj, e2n.c)) {
                    i4 = R.id.paste;
                } else if (Intrinsics.areEqual(obj, e2n.d)) {
                    i4 = R.id.selectAll;
                } else if (Intrinsics.areEqual(obj, e2n.e)) {
                    i4 = R.id.autofill;
                } else {
                    i4 = i8;
                }
                final ori oriVar = (ori) friVar;
                MenuItem add = menu.add(i9, i4, i8, oriVar.b);
                add.setShowAsAction(2);
                add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: g60
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        int i11;
                        int i12 = i5;
                        Object obj2 = this;
                        Object obj3 = oriVar;
                        switch (i12) {
                            case 0:
                                ((ori) obj3).d.invoke(((h60) obj2).a);
                                return true;
                            default:
                                Context context = (Context) obj3;
                                TextClassification textClassification = (TextClassification) obj2;
                                String text = textClassification.getText();
                                if (text != null) {
                                    i11 = text.hashCode();
                                } else {
                                    i11 = 0;
                                }
                                PendingIntent activity = PendingIntent.getActivity(context, i11, textClassification.getIntent(), 201326592);
                                if (Build.VERSION.SDK_INT >= 34) {
                                    try {
                                        sre.h(activity, sre.b(ActivityOptions.makeBasic()).toBundle());
                                    } catch (PendingIntent.CanceledException e) {
                                        m0.d("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                    }
                                } else {
                                    activity.send();
                                }
                                return true;
                        }
                    }
                });
            } else if (friVar instanceof uri) {
                i = i8 + 1;
                final Context context = this.d.getContext();
                uri uriVar = (uri) friVar;
                final TextClassification textClassification = uriVar.b;
                int i11 = uriVar.c;
                if (i11 < 0) {
                    MenuItem add2 = menu.add(R.id.textAssist, R.id.textAssist, i8, textClassification.getLabel());
                    add2.setShowAsAction(2);
                    add2.setIcon(textClassification.getIcon());
                    add2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: g60
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            int i112;
                            int i12 = i6;
                            Object obj2 = textClassification;
                            Object obj3 = context;
                            switch (i12) {
                                case 0:
                                    ((ori) obj3).d.invoke(((h60) obj2).a);
                                    return true;
                                default:
                                    Context context2 = (Context) obj3;
                                    TextClassification textClassification2 = (TextClassification) obj2;
                                    String text = textClassification2.getText();
                                    if (text != null) {
                                        i112 = text.hashCode();
                                    } else {
                                        i112 = 0;
                                    }
                                    PendingIntent activity = PendingIntent.getActivity(context2, i112, textClassification2.getIntent(), 201326592);
                                    if (Build.VERSION.SDK_INT >= 34) {
                                        try {
                                            sre.h(activity, sre.b(ActivityOptions.makeBasic()).toBundle());
                                        } catch (PendingIntent.CanceledException e) {
                                            m0.d("TextClassification", "error sending pendingIntent: " + activity + " error: " + e);
                                        }
                                    } else {
                                        activity.send();
                                    }
                                    return true;
                            }
                        }
                    });
                } else {
                    if (i11 == 0) {
                        i2 = 1;
                    } else {
                        i2 = i5;
                    }
                    final RemoteAction remoteAction = textClassification.getActions().get(i11);
                    if (i2 != 0) {
                        i3 = 16908353;
                    } else {
                        i3 = i5;
                    }
                    MenuItem add3 = menu.add(R.id.textAssist, i3, i8, remoteAction.getTitle());
                    if (i2 == 0) {
                        i10 = 0;
                    }
                    add3.setShowAsAction(i10);
                    if (i2 != 0 || remoteAction.shouldShowIcon()) {
                        add3.setIcon(remoteAction.getIcon().loadDrawable(context));
                    }
                    add3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: ayi
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            PendingIntent actionIntent = remoteAction.getActionIntent();
                            if (Build.VERSION.SDK_INT >= 34) {
                                try {
                                    sre.h(actionIntent, sre.b(ActivityOptions.makeBasic()).toBundle());
                                } catch (PendingIntent.CanceledException e) {
                                    m0.d("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e);
                                }
                                return true;
                            }
                            actionIntent.send();
                            return true;
                        }
                    });
                }
            } else {
                if (friVar instanceof sri) {
                    i9++;
                }
                i7++;
                i5 = 0;
            }
            i8 = i;
            i7++;
            i5 = 0;
        }
        return true;
    }
}
