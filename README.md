# 🧭 NavigationComponent

A modern Android navigation component implementation that provides a seamless and intuitive navigation experience for Android applications.

## 📋 About

NavigationComponent is an Android library that simplifies the implementation of navigation in Android applications. It provides a robust and flexible way to handle navigation between different screens and destinations in your app.

## 🚀 Features

- 🔄 Seamless navigation between screens
- 🎯 Type-safe navigation
- 📱 Support for deep linking
- 🔍 Safe args integration
- 🎨 Customizable animations
- 📦 Easy to integrate
- 🛠️ Kotlin-first approach

## 📥 Installation

Add the following dependency to your app's `build.gradle.kts` file:

```kotlin
dependencies {
    implementation("com.github.tamerakdeniz:NavigationComponent:latest.version")
}
```

## 🛠️ Usage

1. Add the navigation graph to your project:

```xml
<navigation xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:id="@+id/nav_graph"
    app:startDestination="@id/homeFragment">

    <fragment
        android:id="@+id/homeFragment"
        android:name="com.example.app.HomeFragment"
        android:label="Home">
        <action
            android:id="@+id/action_home_to_detail"
            app:destination="@id/detailFragment" />
    </fragment>
</navigation>
```

2. Set up the NavController in your activity:

```kotlin
val navController = findNavController(R.id.nav_host_fragment)
```

## 📁 Project Structure

```
NavigationComponent/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   └── res/
│   │   └── test/
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── build.gradle.kts
└── settings.gradle.kts
```

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

Tamer Akdeniz

- GitHub: [@tamerakdeniz](https://github.com/tamerakdeniz)

## ⭐ Support

If you find this project helpful, please give it a star on GitHub!
