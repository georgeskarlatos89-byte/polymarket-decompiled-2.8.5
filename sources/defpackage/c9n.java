package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.os.StatFs;
import io.getstream.chat.android.client.internal.offline.repository.domain.message.internal.LocationEntity;
import io.getstream.chat.android.models.Location;
import io.radar.sdk.RadarTrackingOptions;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public abstract class c9n {
    public static boolean a;
    public static String b;

    public static Object b(Object obj) {
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() != 12345) {
                return obj;
            }
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() != 12345.0d) {
                return obj;
            }
        } else if (obj instanceof Long) {
            if (((Long) obj).longValue() != 12345) {
                return obj;
            }
        } else if (obj instanceof Float) {
            if (((Float) obj).floatValue() != 12345.0f) {
                return obj;
            }
        } else if (obj instanceof String) {
            if (obj.equals("default")) {
                return "-400";
            }
            return obj;
        }
        return -400;
    }

    public static JSONObject c(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(fvk.FEATURE.toString(), "s");
        jSONObject.put(fvk.PAYLOAD.toString(), jSONArray);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("pairing_id", str);
        String fvkVar = fvk.AUDIT_KEY.toString();
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONObject);
        jSONObject2.put(fvkVar, jSONArray2);
        return jSONObject2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x004e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean f(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i = 0;
        while (true) {
            if (i >= split.length && i >= split2.length) {
                break;
            }
            if (i < split.length && i < split2.length) {
                if (Integer.parseInt(split[i]) < Integer.parseInt(split2[i])) {
                    break;
                }
                if (Integer.parseInt(split[i]) > Integer.parseInt(split2[i])) {
                    return true;
                }
                i++;
            } else {
                if (i < split.length) {
                    if (Integer.parseInt(split[i]) != 0) {
                        return true;
                    }
                } else if (i < split2.length && Integer.parseInt(split2[i]) != 0) {
                    break;
                }
                i++;
            }
        }
    }

    public static JSONObject h(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("RiskManagerMG", 0);
        b = sharedPreferences.getString("RiskManagerMG", "");
        long j = sharedPreferences.getLong("RiskManagerMGTIMESTAMP", 0L);
        if (b.equals("") && j == 0) {
            b = hx6.a(true);
            j = System.currentTimeMillis();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("RiskManagerMG", b);
            edit.putLong("RiskManagerMGTIMESTAMP", j);
            edit.apply();
        }
        HashMap hashMap = new HashMap();
        hashMap.put(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID, b);
        hashMap.put("created_at", j + "");
        try {
            return new JSONObject("{\"id\":" + ((String) hashMap.get(RadarTrackingOptions.RadarTrackingOptionsForegroundService.KEY_FOREGROUND_SERVICE_ID)) + ",\"created_at\":" + ((String) hashMap.get("created_at")) + "}");
        } catch (JSONException unused) {
            return null;
        }
    }

    public static byte[] i(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i = 0; i < 16; i++) {
                byte b2 = (byte) ((bArr[i] << 1) & 254);
                bArr2[i] = b2;
                if (i < 15) {
                    bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b2);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        dmk.v("value must be a block.");
        return null;
    }

    public static final LocationEntity j(Location location) {
        location.getClass();
        return new LocationEntity(location.getCid(), location.getMessageId(), location.getUserId(), location.getEndAt(), location.getLatitude(), location.getLongitude(), location.getDeviceId());
    }

    public long a(int i) {
        String str;
        long blockSize;
        int blockCount;
        File file = new File("/storage");
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.exists()) {
                        try {
                            if (Environment.isExternalStorageRemovable(file2)) {
                                str = file2.getAbsolutePath();
                                break;
                            }
                            continue;
                        } catch (Exception e) {
                            wsk.b(this.getClass(), e);
                        }
                    }
                }
            }
            str = "";
            if (!str.isEmpty()) {
                File file3 = new File(str);
                if (file3.exists()) {
                    StatFs statFs = new StatFs(file3.getPath());
                    if (i == 600) {
                        blockSize = statFs.getBlockSize();
                        blockCount = statFs.getAvailableBlocks();
                    } else if (i == 601) {
                        blockSize = statFs.getBlockSize();
                        blockCount = statFs.getBlockCount();
                    }
                    return blockSize * blockCount;
                }
            }
        }
        return 12345L;
    }

    public boolean d(Context context, String str) {
        try {
            if (context.checkCallingOrSelfPermission(str) != 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            wsk.b(this.getClass(), e);
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00b4. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6 A[Catch: Exception -> 0x004a, TRY_LEAVE, TryCatch #0 {Exception -> 0x004a, blocks: (B:3:0x0003, B:5:0x000b, B:8:0x0013, B:10:0x0031, B:13:0x0039, B:15:0x0045, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x006d, B:41:0x00b8, B:42:0x00bb, B:43:0x00c0, B:44:0x00c2, B:46:0x00c6), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(qwk qwkVar, int i, String str, String str2, Context context) {
        int i2;
        try {
            JSONObject optJSONObject = qwkVar.b.optJSONObject(str2);
            if (optJSONObject != null && !str.equalsIgnoreCase("")) {
                String string = optJSONObject.getString(yvk.MIN_VERSION.toString());
                String replaceAll = "5.6.0.release".replaceAll(".debug", "").replaceAll(".release", "");
                if (!string.equalsIgnoreCase("") && f(replaceAll, string)) {
                    if (optJSONObject.getBoolean(yvk.OPEN.toString())) {
                        return g(optJSONObject, i, context);
                    }
                    if (i == eyb.PAYPAL.a() || i == eyb.VENMO.a()) {
                        int optInt = optJSONObject.optInt(yvk.RAMP_THRESHOLD.toString(), 0);
                        if (!str.equalsIgnoreCase("")) {
                            String lowerCase = str.toLowerCase();
                            int abs = Math.abs(optInt);
                            int abs2 = Math.abs(lowerCase.hashCode());
                            if (abs2 > 0) {
                                char c = 65535;
                                switch (str2.hashCode()) {
                                    case 115:
                                        if (str2.equals("s")) {
                                            c = 0;
                                            break;
                                        }
                                        break;
                                    case 3343:
                                        if (str2.equals("hw")) {
                                            c = 1;
                                            break;
                                        }
                                        break;
                                    case 3696:
                                        if (str2.equals("td")) {
                                            c = 2;
                                            break;
                                        }
                                        break;
                                    case 3711:
                                        if (str2.equals("ts")) {
                                            c = 3;
                                            break;
                                        }
                                        break;
                                }
                                switch (c) {
                                    case 0:
                                        i2 = abs2 % 100;
                                        if (i2 < abs) {
                                            a = true;
                                        }
                                        if (i2 >= abs) {
                                            return true;
                                        }
                                        break;
                                    case 1:
                                        abs2 /= 100;
                                        i2 = abs2 % 100;
                                        if (i2 < abs) {
                                        }
                                        if (i2 >= abs) {
                                        }
                                        break;
                                    case 2:
                                        abs2 /= 1000000;
                                        i2 = abs2 % 100;
                                        if (i2 < abs) {
                                        }
                                        if (i2 >= abs) {
                                        }
                                        break;
                                    case 3:
                                        abs2 /= 10000;
                                        i2 = abs2 % 100;
                                        if (i2 < abs) {
                                        }
                                        if (i2 >= abs) {
                                        }
                                        break;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        } catch (Exception e) {
            wsk.b(getClass(), e);
            return false;
        }
    }

    public boolean g(JSONObject jSONObject, int i, Context context) {
        boolean z;
        boolean z2;
        try {
            String packageName = context.getPackageName();
            String replaceAll = "5.6.0.release".replaceAll(".debug", "").replaceAll(".release", "");
            Iterator it = hx6.f(jSONObject.getJSONArray(yvk.EXCLUDED.toString())).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((String) it.next()).equalsIgnoreCase(replaceAll)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                ArrayList f = hx6.f(jSONObject.getJSONArray(yvk.APP_IDS.toString()));
                JSONArray jSONArray = jSONObject.getJSONArray(yvk.APP_SOURCES.toString());
                ArrayList arrayList = new ArrayList();
                if (jSONArray != null && jSONArray.length() > 0) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        arrayList.add((Integer) jSONArray.get(i2));
                    }
                }
                if (!arrayList.contains(Integer.valueOf(i))) {
                    Iterator it2 = f.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((String) it2.next()).equalsIgnoreCase(packageName)) {
                                z2 = true;
                                break;
                            }
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (z2) {
                    }
                }
                return false;
            }
            return true;
        } catch (Exception e) {
            wsk.b(getClass(), e);
            return false;
        }
    }
}
