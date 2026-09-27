package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.polymarket.android.R;
import io.radar.sdk.RadarTrackingOptions;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class tad {
    public final boolean A;
    public sad B;
    public final Notification C;
    public boolean D;
    public final ArrayList E;
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public fbd l;
    public CharSequence m;
    public String n;
    public boolean o;
    public String q;
    public Bundle r;
    public Notification u;
    public RemoteViews v;
    public RemoteViews w;
    public String x;
    public String y;
    public xqb z;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean k = true;
    public boolean p = false;
    public int s = 0;
    public int t = 0;

    public tad(Context context, String str) {
        Notification notification = new Notification();
        this.C = notification;
        this.a = context;
        this.x = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.E = new ArrayList();
        this.A = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Throwable, android.os.Bundle, java.lang.CharSequence, java.lang.CharSequence[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ysk, java.lang.Object, had] */
    public final Notification a() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Icon c;
        int i;
        Notification.BubbleMetadata a;
        RemoteViews remoteViews;
        RemoteViews remoteViews2;
        Bundle bundle;
        RemoteViews makeHeadsUpContentView;
        RemoteViews makeBigContentView;
        int i2;
        int i3;
        Bundle[] bundleArr;
        int i4;
        ?? obj = new Object();
        obj.c = new Bundle();
        obj.b = this;
        Notification.Builder builder = new Notification.Builder(this.a, this.x);
        obj.a = builder;
        Notification notification = this.C;
        Resources resources = null;
        Notification.Builder lights = builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        int i5 = 0;
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(this.e).setContentText(this.f).setContentInfo(null).setContentIntent(this.g).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(null, z4).setNumber(this.i).setProgress(0, 0, false);
        IconCompat iconCompat = this.h;
        if (iconCompat == null) {
            c = null;
        } else {
            c = w3m.c(iconCompat);
        }
        builder.setLargeIcon(c);
        builder.setSubText(this.m).setUsesChronometer(false).setPriority(this.j);
        fbd fbdVar = this.l;
        if (fbdVar instanceof uad) {
            uad uadVar = (uad) fbdVar;
            nad a2 = uadVar.a(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, null, R.color.call_notification_decline_color, null);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(a2);
            ArrayList arrayList2 = uadVar.mBuilder.b;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    nad nadVar = (nad) it.next();
                    if (nadVar.f) {
                        arrayList.add(nadVar);
                    } else if (!nadVar.a.getBoolean("key_action_priority")) {
                        arrayList.add(nadVar);
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                obj.g((nad) it2.next());
            }
        } else {
            Iterator it3 = this.b.iterator();
            while (it3.hasNext()) {
                obj.g((nad) it3.next());
            }
        }
        Bundle bundle2 = this.r;
        if (bundle2 != null) {
            ((Bundle) obj.c).putAll(bundle2);
        }
        ((Notification.Builder) obj.a).setShowWhen(this.k);
        ((Notification.Builder) obj.a).setLocalOnly(this.p);
        ((Notification.Builder) obj.a).setGroup(this.n);
        ((Notification.Builder) obj.a).setSortKey(null);
        ((Notification.Builder) obj.a).setGroupSummary(this.o);
        ((Notification.Builder) obj.a).setCategory(this.q);
        ((Notification.Builder) obj.a).setColor(this.s);
        ((Notification.Builder) obj.a).setVisibility(this.t);
        ((Notification.Builder) obj.a).setPublicVersion(this.u);
        ((Notification.Builder) obj.a).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList3 = this.E;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                ((Notification.Builder) obj.a).addPerson((String) it4.next());
            }
        }
        ArrayList arrayList4 = this.d;
        if (arrayList4.size() > 0) {
            Bundle bundle3 = this.r;
            if (bundle3 == null) {
                bundle3 = new Bundle();
                this.r = bundle3;
            }
            Bundle bundle4 = bundle3.getBundle("android.car.EXTENSIONS");
            if (bundle4 == null) {
                bundle4 = new Bundle();
            }
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i6 = 0;
            while (i6 < arrayList4.size()) {
                String num = Integer.toString(i6);
                nad nadVar2 = (nad) arrayList4.get(i6);
                Bundle bundle7 = new Bundle();
                IconCompat iconCompat2 = nadVar2.b;
                if (iconCompat2 == null && (i4 = nadVar2.g) != 0) {
                    iconCompat2 = IconCompat.b(resources, "", i4);
                    nadVar2.b = iconCompat2;
                }
                Bundle bundle8 = nadVar2.a;
                if (iconCompat2 != null) {
                    i3 = iconCompat2.c();
                } else {
                    i3 = i5;
                }
                ?? r16 = resources;
                bundle7.putInt(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ICON, i3);
                bundle7.putCharSequence(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_TITLE, nadVar2.h);
                bundle7.putParcelable("actionIntent", nadVar2.i);
                Bundle bundle9 = new Bundle(bundle8);
                bundle9.putBoolean("android.support.allowGeneratedReplies", nadVar2.d);
                bundle7.putBundle("extras", bundle9);
                azf[] azfVarArr = nadVar2.c;
                if (azfVarArr == null) {
                    bundleArr = r16;
                } else {
                    bundleArr = new Bundle[azfVarArr.length];
                    if (azfVarArr.length > 0) {
                        azf azfVar = azfVarArr[0];
                        Bundle bundle10 = new Bundle();
                        r16.getClass();
                        bundle10.putString("resultKey", "text_reply");
                        bundle10.putCharSequence("label", r16);
                        bundle10.putCharSequenceArray("choices", r16);
                        bundle10.putBoolean("allowFreeFormInput", true);
                        bundle10.putBundle("extras", r16);
                        throw r16;
                    }
                }
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", nadVar2.e);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(num, bundle7);
                i6++;
                i5 = 0;
                resources = r16;
            }
            i = 1;
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            Bundle bundle11 = this.r;
            if (bundle11 == null) {
                bundle11 = new Bundle();
                this.r = bundle11;
            }
            bundle11.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) obj.c).putBundle("android.car.EXTENSIONS", bundle5);
        } else {
            i = 1;
        }
        ((Notification.Builder) obj.a).setExtras(this.r);
        ((Notification.Builder) obj.a).setRemoteInputHistory(null);
        RemoteViews remoteViews3 = this.v;
        if (remoteViews3 != null) {
            ((Notification.Builder) obj.a).setCustomContentView(remoteViews3);
        }
        RemoteViews remoteViews4 = this.w;
        if (remoteViews4 != null) {
            ((Notification.Builder) obj.a).setCustomBigContentView(remoteViews4);
        }
        ((Notification.Builder) obj.a).setBadgeIconType(0);
        ((Notification.Builder) obj.a).setSettingsText(null);
        ((Notification.Builder) obj.a).setShortcutId(this.y);
        ((Notification.Builder) obj.a).setTimeoutAfter(0L);
        ((Notification.Builder) obj.a).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(this.x)) {
            ((Notification.Builder) obj.a).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it5 = this.c.iterator();
        while (it5.hasNext()) {
            ble bleVar = (ble) it5.next();
            Notification.Builder builder2 = (Notification.Builder) obj.a;
            bleVar.getClass();
            builder2.addPerson(kon.b(bleVar));
        }
        ((Notification.Builder) obj.a).setAllowSystemGeneratedContextualActions(this.A);
        Notification.Builder builder3 = (Notification.Builder) obj.a;
        sad sadVar = this.B;
        if (sadVar == null) {
            a = null;
        } else {
            a = rad.a(sadVar);
        }
        builder3.setBubbleMetadata(a);
        xqb xqbVar = this.z;
        if (xqbVar != null) {
            ((Notification.Builder) obj.a).setLocusId(xqbVar.b);
        }
        if (Build.VERSION.SDK_INT >= 36) {
            z6.f((Notification.Builder) obj.a);
        }
        if (this.D) {
            if (((tad) obj.b).o) {
                i2 = 2;
            } else {
                i2 = i;
            }
            remoteViews = null;
            ((Notification.Builder) obj.a).setVibrate(null);
            ((Notification.Builder) obj.a).setSound(null);
            int i7 = notification.defaults & (-4);
            notification.defaults = i7;
            ((Notification.Builder) obj.a).setDefaults(i7);
            if (TextUtils.isEmpty(((tad) obj.b).n)) {
                ((Notification.Builder) obj.a).setGroup("silent");
            }
            ((Notification.Builder) obj.a).setGroupAlertBehavior(i2);
        } else {
            remoteViews = null;
        }
        tad tadVar = (tad) obj.b;
        fbd fbdVar2 = tadVar.l;
        if (fbdVar2 != 0) {
            fbdVar2.apply(obj);
        }
        if (fbdVar2 != 0) {
            remoteViews2 = fbdVar2.makeContentView(obj);
        } else {
            remoteViews2 = remoteViews;
        }
        Notification build = ((Notification.Builder) obj.a).build();
        if (remoteViews2 != null) {
            build.contentView = remoteViews2;
        } else {
            RemoteViews remoteViews5 = tadVar.v;
            if (remoteViews5 != null) {
                build.contentView = remoteViews5;
            }
        }
        if (fbdVar2 != 0 && (makeBigContentView = fbdVar2.makeBigContentView(obj)) != null) {
            build.bigContentView = makeBigContentView;
        }
        if (fbdVar2 != 0 && (makeHeadsUpContentView = tadVar.l.makeHeadsUpContentView(obj)) != null) {
            build.headsUpContentView = makeHeadsUpContentView;
        }
        if (fbdVar2 != 0 && (bundle = build.extras) != null) {
            fbdVar2.addCompatExtras(bundle);
        }
        return build;
    }

    public final void c(int i, boolean z) {
        Notification notification = this.C;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void d(fbd fbdVar) {
        if (this.l != fbdVar) {
            this.l = fbdVar;
            if (fbdVar != null) {
                fbdVar.setBuilder(this);
            }
        }
    }
}
