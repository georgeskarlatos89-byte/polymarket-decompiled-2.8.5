package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import defpackage.d55;
import defpackage.dmk;
import defpackage.f08;
import defpackage.g08;
import defpackage.k84;
import defpackage.qp7;
import defpackage.woa;
import io.ably.lib.util.AgentHeaderCreator;
import io.sentry.android.core.performance.f;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private String mAuthority;
    private f08 mLocalPathStrategy;
    private final Object mLock = new Object();
    private final int mResourceId = 0;
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File(AgentHeaderCreator.AGENT_DIVIDER);
    private static final HashMap<String, f08> sCache = new HashMap<>();

    public static String access$000(String str) {
        if (str.length() > 0 && str.charAt(str.length() - 1) == '/') {
            return woa.k(1, 0, str);
        }
        return str;
    }

    public static f08 b(String str, int i, Context context) {
        f08 f08Var;
        HashMap<String, f08> hashMap = sCache;
        synchronized (hashMap) {
            try {
                f08Var = hashMap.get(str);
                if (f08Var == null) {
                    try {
                        try {
                            f08Var = c(str, i, context);
                            hashMap.put(str, f08Var);
                        } catch (IOException e) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                        }
                    } catch (XmlPullParserException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f08Var;
    }

    public static g08 c(String str, int i, Context context) {
        File file;
        g08 g08Var = new g08(str);
        XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = fileProviderPathsMetaData.next();
            if (next != 1) {
                if (next == 2) {
                    String name = fileProviderPathsMetaData.getName();
                    String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, "name");
                    String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, ATTR_PATH);
                    if (TAG_ROOT_PATH.equals(name)) {
                        file = DEVICE_ROOT;
                    } else if (TAG_FILES_PATH.equals(name)) {
                        file = context.getFilesDir();
                    } else if (TAG_CACHE_PATH.equals(name)) {
                        file = context.getCacheDir();
                    } else if (TAG_EXTERNAL.equals(name)) {
                        file = Environment.getExternalStorageDirectory();
                    } else if (TAG_EXTERNAL_FILES.equals(name)) {
                        File[] i2 = d55.i(context, null);
                        if (i2.length > 0) {
                            file = i2[0];
                        }
                        file = null;
                    } else if (TAG_EXTERNAL_CACHE.equals(name)) {
                        File[] h = d55.h(context);
                        if (h.length > 0) {
                            file = h[0];
                        }
                        file = null;
                    } else {
                        if (TAG_EXTERNAL_MEDIA.equals(name)) {
                            File[] externalMediaDirs = context.getExternalMediaDirs();
                            if (externalMediaDirs.length > 0) {
                                file = externalMediaDirs[0];
                            }
                        }
                        file = null;
                    }
                    if (file == null) {
                        continue;
                    } else {
                        String str2 = new String[]{attributeValue2}[0];
                        if (str2 != null) {
                            file = new File(file, str2);
                        }
                        if (!TextUtils.isEmpty(attributeValue)) {
                            try {
                                g08Var.b.put(attributeValue, file.getCanonicalFile());
                            } catch (IOException e) {
                                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
                            }
                        } else {
                            dmk.v("Name must not be empty");
                            return null;
                        }
                    }
                }
            } else {
                return g08Var;
            }
        }
    }

    public static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, ProviderInfo providerInfo, int i) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt(META_DATA_FILE_PROVIDER_PATHS, i);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            dmk.v("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            return null;
        }
        dmk.v(k84.g("Couldn't find meta-data for provider with authority ", str));
        return null;
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        String substring;
        g08 g08Var = (g08) b(str, 0, context);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : g08Var.b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (access$000(canonicalPath).startsWith(access$000(path) + '/') && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                if (path2.endsWith(AgentHeaderCreator.AGENT_DIVIDER)) {
                    substring = canonicalPath.substring(path2.length());
                } else {
                    substring = canonicalPath.substring(path2.length() + 1);
                }
                return new Uri.Builder().scheme("content").authority(g08Var.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, AgentHeaderCreator.AGENT_DIVIDER)).build();
            }
            dmk.v(k84.g("Failed to find configured root that contains ", canonicalPath));
            return null;
        } catch (IOException unused) {
            qp7.k(file, "Failed to resolve canonical path for ");
            return null;
        }
    }

    public final f08 a() {
        f08 f08Var;
        synchronized (this.mLock) {
            try {
                if (this.mAuthority != null) {
                    f08Var = this.mLocalPathStrategy;
                    if (f08Var == null) {
                        f08Var = b(this.mAuthority, this.mResourceId, getContext());
                        this.mLocalPathStrategy = f08Var;
                    }
                } else {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f08Var;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority;
                if (str != null && !str.trim().isEmpty()) {
                    String str2 = providerInfo.authority.split(";")[0];
                    synchronized (this.mLock) {
                        this.mAuthority = str2;
                    }
                    HashMap<String, f08> hashMap = sCache;
                    synchronized (hashMap) {
                        hashMap.remove(str2);
                    }
                    return;
                }
                throw new SecurityException("Provider must have a non-empty authority");
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return ((g08) a()).a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File a = ((g08) a()).a(uri);
        int lastIndexOf = a.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        f.d(this);
        f.e(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File a = ((g08) a()).a(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                i = 704643072;
            } else if ("rw".equals(str)) {
                i = 939524096;
            } else if ("rwt".equals(str)) {
                i = 1006632960;
            } else {
                dmk.v(k84.g("Invalid mode: ", str));
                return null;
            }
        } else {
            i = 738197504;
        }
        return ParcelFileDescriptor.open(a, i);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        String str3;
        File a = ((g08) a()).a(uri);
        String queryParameter = uri.getQueryParameter(DISPLAYNAME_FIELD);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                if (queryParameter == null) {
                    str3 = a.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i2] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(a.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public static Uri getUriForFile(Context context, String str, File file, String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter(DISPLAYNAME_FIELD, str2).build();
    }
}
