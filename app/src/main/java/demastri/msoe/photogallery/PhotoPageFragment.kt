package demastri.msoe.photogallery

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import demastri.msoe.photogallery.databinding.FragmentPhotoPageBinding

class PhotoPageFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentPhotoPageBinding.inflate(
            inflater,
            container,
            false
        )

        return binding.root
    }
}