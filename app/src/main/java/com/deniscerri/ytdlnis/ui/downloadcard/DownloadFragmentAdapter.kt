package com.deniscerri.ytdlnis.ui.downloadcard

import android.util.Log
import androidx.annotation.NonNull
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.deniscerri.ytdlnis.database.models.DownloadItem
import com.google.gson.Gson

class DownloadFragmentAdapter (
    private val audioDownloadItem : DownloadItem,
    private val videoDownloadItem : DownloadItem,
    private val commandDownloadItem : DownloadItem,
    fragmentManager : FragmentManager,
    lifecycle : Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> {
                return DownloadAudioFragment(audioDownloadItem)
            }
            1 -> {
                return DownloadVideoFragment(videoDownloadItem)
            }
        }
        return DownloadCommandFragment(commandDownloadItem)
    }

}