package org.xmart.elections.screens.bulletin

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.fragment_choose_candidate.*
import org.xmart.elections.R
import org.xmart.elections.base.BaseFragment
import org.xmart.elections.models.Candidate
import org.xmart.elections.screens.bulletin.list.CandidatesListAdapter

class ChooseCandidateFragment : BaseFragment(R.layout.fragment_choose_candidate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initList()
    }

    private fun initList() {
        rv_candidates.apply {
            adapter = CandidatesListAdapter(
              ArrayList<Candidate>().apply {
                  add(Candidate("Дмитриев Андрей Владимирович", "Бакалавр политических наук. Лидер гражданской кампании «Говори правду»."))
                  add(Candidate("Канопацкая Анна Анатольевна", "Депутат Палаты представителей Национального собрания Республики Беларусь VI созыва"))
                  add(Candidate("Лукашенко Александр Григорьевич", "Президент Республики Беларусь. Не является членом партий."))
                  add(Candidate("Тихановская Светлана Георгиевна", "Автор канала «Страна для жизни», политический деятель"))
                  add(Candidate("Черчень Сергей Владимирович", "Председатель партии Белорусская социал-демократическая Грамада"))
                  add(Candidate("Против всех кандидатов", "Не поддерживаю ни одного из представленных выше кандидатов", Candidate.Type.AGAINST_ALL))
              }
            ) {
                btn_leave_my_vote.apply {
                    setOnClickListener {
                        navigateTo(R.id.action_chooseCandidateFragment_to_voteSuccessFragment)
                    }
                    isEnabled = true
                }
            };
        }
    }

}